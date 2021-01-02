package com.tram.btrecyclerview;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodyItem {
    private String name, address, comment;
    private Integer image, imageAvt, commentCount, imageCount;

    public FoodyItem(String name, String address, String comment, Integer image, Integer imageAvt, Integer commentCount, Integer imageCount) {
        this.name = name;
        this.address = address;
        this.comment = comment;
        this.image = image;
        this.imageAvt = imageAvt;
        this.commentCount = commentCount;
        this.imageCount = imageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getImageAvt() {
        return imageAvt;
    }

    public void setImageAvt(Integer imageAvt) {
        this.imageAvt = imageAvt;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getImageCount() {
        return imageCount;
    }

    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    @Override
    public String toString() {
        return "FoodyItem{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                ", image=" + image +
                ", imageAvt=" + imageAvt +
                ", commentCount=" + commentCount +
                ", imageCount=" + imageCount +
                '}';
    }
    public static ArrayList<FoodyItem>getmock(){
        return new ArrayList<>(Arrays.asList(
                new FoodyItem("Bếp Chất - Cơm Văn Phòng","1 Ngõ 26 Doãn Kế Thiện, Quận Cầu Gấm","Khanh Nguyễn: Cả suất hết 26k tính cả ship do có mã freeship",R.drawable.hinhmon1,R.drawable.avt1,56,1300),
                new FoodyItem("Gà 36 - Nguyễn Tuân","1 Ngõ 187 Nguyễn Tuân, Quận Thanh Xuân, Hà Nội","Hoàng Thị Yến: Ăn ở Gà 36 các chi nhánh bao nhiêu lăm rồi, hôm nay qua Thanh Xuân ăn hình như có chị quản lý mới hay sao ý nhỉ. Nói với khách hàng mặt cau có",R.drawable.hinhmon2,R.drawable.avt2,10,29),
                new FoodyItem("Hiền Hảo - Quán Chè Trân Châu To, Bánh Gối & Nem Chua","Ngõ 9 Hoè Nhai, Quận Ba Đình, Hà Nội","Dương Trố: Quán của cô lúc nào cũng đông ý, cứ mở hàng là bàn full luôn. Cô bán bánh tôm, bánh gối với nhiều loại chè trông ngon lắmmm. Bánh tôm tuy nhiều bột nhưng vẫn giòn lắm, tôm to con nào con ấy đỏ au thích",R.drawable.hinhmon3,R.drawable.avt3,26,168),
                new FoodyItem("Cháo Sườn Sụn 88 - Cháo Gia Truyền - Shop Online","82 Ngõ 17 Mạc Thị Bưởi, P. Vĩnh Tuy, Quận Hai Bà Trưng, Hà Nội","Văn Hà: Chúc quán phát tài phát lộc ",R.drawable.hinhmon4,R.drawable.avt4,15,406),
                new FoodyItem("Cơm Tấm Yến Vy - Shop Online","62 Ngõ 143 Ngách 2 Yên Lãng, P. Láng Hạ, Quận Đống Đa, Hà Nội","Ngô Yến: Mình đã oder rất nhiều lần rồi,thật sự dành lời khen cho quán.Cơm ngon giá hợp lý,kèm hoa tráng miệng thơm ngon sạch mồm ",R.drawable.hinhmon5,R.drawable.avt5,12,12),
                new FoodyItem("Hotto - Món Ngon Trên Đĩa Nóng - Times City","Tầng B1, Times City, 458 Minh Khai, Quận Hai Bà Trưng, Hà Nội","Quang Duy:Vị trí nằm trong trung tâm thương mại time city nên khá Thuận tiện để mọi người mua sắm và ăn uống mình đã một lần nhưng hôm nay ăn lại lần thứ hai xem chất lượng như thế ",R.drawable.hinhmon6,R.drawable.avt6,37,166),
                new FoodyItem("Bún Chả Đắc Kim - Đường Thành","67 Đường Thành, Quận Hoàn Kiếm, Hà Nội","harada hidenori:揚げ春巻きが特に美味しい。酸っぱさと甘さがベスト ",R.drawable.hinhmon7,R.drawable.avt7,28,68),
                new FoodyItem("Chicken Society - Cơm Gà Hải Nam","Lobby Fraser Suites Hanoi, 51 Xuân Diệu, Quận Tây Hồ, Hà Nội","Huyền Ann Nguyễn: đã thử ăn ở đây đợt sinh nhật bạn mình và lúc này quán cũng vừa mới khai trương. vì gần nhà nên mò cũng không khó lắm ",R.drawable.hinhmon8,R.drawable.avt8,3,2)
        ));

    }
}
