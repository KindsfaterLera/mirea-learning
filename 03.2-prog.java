class Human {

    private Hand hands = new Hand();
    private Head head = new Head();
    private Leg legs = new Leg();

    public Hand getHand() {
        return hands;
    }

    public void setHand1(Hand hands) {
        this.hands = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head heads) {
        this.head = head;
    }


    public Leg getLeg() {
        return legs;
    }

    public void setLeg2(Leg leg) {
        this.legs = leg;
    }

    public String ToString(){
        System.out.println("Human: hands = " + hands + ", head = " + head + ", legs = " + legs);
    }
}
