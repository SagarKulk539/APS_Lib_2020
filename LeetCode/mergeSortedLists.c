/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/merge-two-sorted-lists/
Code by : Sagar Kulkarni
*/

#include<stdlib.h>

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* getNode()
{
    return (malloc(sizeof(struct ListNode)));
}

struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2)
{
    int count=0;
    struct ListNode *nw,*first,*trav;
    first=NULL;
    trav=NULL;
    if(l1==NULL && l2==NULL)
        return first;
    else
    {
        while(l1!=NULL && l2!=NULL)
        {
            if(count==0)
            {
                nw=getNode();
                nw->next=NULL;
                trav=nw;
                first=trav;
                count=1;
            }


            if(count!=1)
            {
                nw=getNode();
                nw->next=NULL;
                trav->next=nw;
                trav=trav->next;
            }
            else
                count=465;

            if(l1->val < l2->val)
            {
                trav->val=l1->val;
                l1=l1->next;
            }
            else if(l1->val > l2->val)
            {
                trav->val=l2->val;
                l2=l2->next;
            }
            else
            {
                trav->val=l2->val;
                nw=getNode();
                nw->next=NULL;
                trav->next=nw;
                trav=trav->next;
                trav->val=l2->val;
                l1=l1->next;
                l2=l2->next;
            }
        }

        while(l1!=NULL)
        {
            nw=getNode();
            nw->next=NULL;
            if(count==0)
            {
                trav=nw;
                first=trav;
                count=1;
            }
            else
            {
                trav->next=nw;
                trav=trav->next;
            }
            trav->val=l1->val;
            l1=l1->next;
        }

        while(l2!=NULL)
        {
            nw=getNode();
            nw->next=NULL;
            if(count==0)
            {
                trav=nw;
                first=trav;
                count=1;
            }
            else
            {
                trav->next=nw;
                trav=trav->next;
            }
            trav->val=l2->val;
            l2=l2->next;
        }
    }
    return first;
}
