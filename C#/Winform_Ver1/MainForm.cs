using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Winform_Ver1
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private Point mousePoint; // 마우스 포인트를 지정할 변수 선언

        private void TitlePanel_MouseDown(object sender, MouseEventArgs e)
        {
            mousePoint = new Point(e.X, e.Y); // 현재 마우스 포인트를 지정
        }

        private void TitlePanel_MouseMove(object sender, MouseEventArgs e)
        {
            if ((e.Button & MouseButtons.Left) == MouseButtons.Left) // 이벤트 버튼과 마우스 좌클릭이 마우스 좌클릭과 같을때
            {
                Location = new Point(this.Left - (mousePoint.X - e.X), this.Top - (mousePoint.Y - e.Y)); // 새로운 포인트 지정 ( 마우스 X좌표 = 폼 왼쪽 좌표 ) ( 마우스 Y좌표 = 폼 위쪽 좌표 )
            }
        }

        private void ExitButton_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
