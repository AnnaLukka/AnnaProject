package HWLesson10;
public class Family {
    private String familyName;

    public String getFamilyName() {
                return familyName;
            }
            private HWLesson10.Human mother;
            private HWLesson10.Human father;
            private HWLesson10.Human[] children;

            public Family(HWLesson10.Human mother, HWLesson10.Human father, String familyName) {
                this.mother = mother;
                this.father = father;
                this.children = new HWLesson10.Human[0];
                this.familyName = familyName;
                this.mother.setFamily(this);
                this.father.setFamily(this);
            }

            public int countFamily() {
                return 2 + children.length;
            }

            public void addChild(HWLesson10.Human newChild) {
                newChild.setFamily(this);
                HWLesson10.Human[] newArray = new HWLesson10.Human[children.length + 1];
                for (int i = 0; i < children.length; i++) {
                    newArray[i] = children[i];
                }
                newArray[children.length] = newChild;
                children = newArray;
            }

            public void deleteChild(int index) {
                children[index].setFamily(null);
                children[index] = null;
                HWLesson10.Human[] newArray = new HWLesson10.Human[children.length - 1];
                int k = 0;
                for (int i = 0; i < children.length; i++) {
                    if (children[i] == null) {
                        continue;
                    }
                    children[i] = newArray[k];
                    k++;
                }
                children = newArray;
            }
        }
