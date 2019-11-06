using MySql.Data.MySqlClient;
using System;
using System.Drawing;
using System.Threading;
using System.Windows.Forms;

namespace Winform_Ver1
{
    public partial class Login : Form
    {
        string dbTable = "loginuser";
        static string strConn = "Server=localhost;Database=userdata;Uid=root;Pwd=kim4703513!;";
        MySqlConnection conn = new MySqlConnection(strConn);

        public Login()
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

        private void Login_Access(string id, string pw)
        {
            try
            {
                conn.Open();
                string sql = "select * From " + dbTable;
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                MySqlDataReader rdr = cmd.ExecuteReader();
                while(rdr.Read())
                {
                    string userid = rdr[0].ToString();
                    string userpw = rdr[1].ToString();
                    if(id == userid)
                    {
                        if(pw == userpw)
                        {
                            MainForm main = new MainForm();
                            Statuslabel.Text = "로그인에 성공하였습니다.";
                            Statuslabel.ForeColor = Color.Green;
                            Delay_Event(1000);
                            this.Hide();
                            main.Show();
                        }
                        else
                        {
                            Statuslabel.Text = "비밀번호가 올바르지 않습니다.";
                            Statuslabel.ForeColor = Color.Red;
                        }
                    }
                    else
                    {
                        Statuslabel.Text = "아이디를 찾을 수 없습니다.";
                        Statuslabel.ForeColor = Color.Red;
                    }
                }
                rdr.Close();
                conn.Close();
            } 
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private static DateTime Delay_Event(int ms)
        {
            DateTime ThisMoment = DateTime.Now;
            TimeSpan duration = new TimeSpan(0, 0, 0, 0, ms);
            DateTime AfterWards = ThisMoment.Add(duration);

            while (AfterWards >= ThisMoment)
            {
                System.Windows.Forms.Application.DoEvents();
                ThisMoment = DateTime.Now;
            }

            return DateTime.Now;
        }

        private void LoginButton_Click(object sender, EventArgs e)
        {
            Login_Access(IDBox.Text, PWBox.Text);
        }

        private void IDBox_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                LoginButton_Click(sender, e);
            }
        }

        private void PWBox_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                LoginButton_Click(sender, e);
            }
        }

        private void ExitButton_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
