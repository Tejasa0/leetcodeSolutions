class MyLinkedList {
    private List<Integer> li;

    public MyLinkedList() {
        li = new ArrayList<>();
    }

    public int get(int index) {
        if (li.size() > index)
            return li.get(index);
        return -1;
    }

    public void addAtHead(int val) {
        li.add(0, val);
    }

    public void addAtTail(int val) {
        li.add(val);
    }

    public void addAtIndex(int index, int val) {
        if (li.size() > index)
            li.add(index, val);
        else if (li.size() == index)
            li.add(val);
    }

    // -1 -1 1 4 1
    public void deleteAtIndex(int index) {
        if (li.size() > index)
            li.remove(index);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */