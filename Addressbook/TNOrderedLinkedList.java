public class TNOrderedLinkedList <extPersonType>{
        public Node<extPersonType> head;

        public TNOrderedLinkedList(){
            head = null;
        }
        public void addToStart(extPersonType itemData){
            head = new Node(itemData, head);
        }
        public boolean deleteHeadNode(){
            if(head != null){
                head = head.link;
                return true;
            }
            else
                return false;
        }
        public int size(){
            int count = 0;
            Node<extPersonType> position = head;
            while(position != null){
                count++;
                position = position.link;
            }
            return count;
        }
        public boolean contains(extPersonType item){
            return (find(item) != null);
        }
        private Node<extPersonType> find(extPersonType target){
            Node<extPersonType> position = head;
            extPersonType itemAtPosition;
            while(position != null){
                itemAtPosition = position.data;
                if(itemAtPosition.equals(target))
                    return position;
                position = position.link;
            }
            return null;
        }
        public extPersonType findData(extPersonType target){
            Node<extPersonType> result = find(target);
            if(result == null)
                return null;
            else
                return result.data;
        }
        public void outputList(){
            Node<extPersonType> position = head;
            while(position != null){
                System.out.println(position.data);
                position = position.link;
            }
        }
        public boolean isEmpty(){
            return (head == null);
        }
        public void clear(){
            head = null;
        }

        private class Node<extPersonType>{
            private extPersonType data;
            private Node<extPersonType> link;

            public Node(){
                data = null;
                link = null;
            }
            public Node(extPersonType newData, Node<extPersonType> linkValue){
                data = newData;
                link = linkValue;
            }
    }
}
