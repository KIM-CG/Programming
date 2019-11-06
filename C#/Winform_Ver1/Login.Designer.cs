namespace Winform_Ver1
{
    partial class Login
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Login));
            this.TitlePanel = new System.Windows.Forms.Panel();
            this.ExitButton = new System.Windows.Forms.PictureBox();
            this.label1 = new System.Windows.Forms.Label();
            this.MainPanel = new System.Windows.Forms.Panel();
            this.Statuslabel = new System.Windows.Forms.Label();
            this.infoLabel1 = new System.Windows.Forms.Label();
            this.RegisterButton = new System.Windows.Forms.Button();
            this.LoginButton = new System.Windows.Forms.Button();
            this.IDBox = new System.Windows.Forms.TextBox();
            this.CopyrightPanel = new System.Windows.Forms.Panel();
            this.TitleLabel = new System.Windows.Forms.Label();
            this.PWBox = new System.Windows.Forms.TextBox();
            this.PWLabel = new System.Windows.Forms.Label();
            this.IDLabel = new System.Windows.Forms.Label();
            this.ImagePanel = new System.Windows.Forms.Panel();
            this.Image = new System.Windows.Forms.PictureBox();
            this.TitlePanel.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.ExitButton)).BeginInit();
            this.MainPanel.SuspendLayout();
            this.CopyrightPanel.SuspendLayout();
            this.ImagePanel.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.Image)).BeginInit();
            this.SuspendLayout();
            // 
            // TitlePanel
            // 
            this.TitlePanel.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(53)))), ((int)(((byte)(57)))), ((int)(((byte)(68)))));
            this.TitlePanel.Controls.Add(this.ExitButton);
            this.TitlePanel.Controls.Add(this.label1);
            this.TitlePanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.TitlePanel.Location = new System.Drawing.Point(0, 0);
            this.TitlePanel.Name = "TitlePanel";
            this.TitlePanel.Size = new System.Drawing.Size(600, 30);
            this.TitlePanel.TabIndex = 0;
            this.TitlePanel.MouseDown += new System.Windows.Forms.MouseEventHandler(this.TitlePanel_MouseDown);
            this.TitlePanel.MouseMove += new System.Windows.Forms.MouseEventHandler(this.TitlePanel_MouseMove);
            // 
            // ExitButton
            // 
            this.ExitButton.Image = ((System.Drawing.Image)(resources.GetObject("ExitButton.Image")));
            this.ExitButton.Location = new System.Drawing.Point(575, 5);
            this.ExitButton.Name = "ExitButton";
            this.ExitButton.Size = new System.Drawing.Size(20, 20);
            this.ExitButton.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.ExitButton.TabIndex = 1;
            this.ExitButton.TabStop = false;
            this.ExitButton.Click += new System.EventHandler(this.ExitButton_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(9, 8);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "포트폴리오";
            // 
            // MainPanel
            // 
            this.MainPanel.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(43)))), ((int)(((byte)(47)))), ((int)(((byte)(58)))));
            this.MainPanel.Controls.Add(this.Statuslabel);
            this.MainPanel.Controls.Add(this.infoLabel1);
            this.MainPanel.Controls.Add(this.RegisterButton);
            this.MainPanel.Controls.Add(this.LoginButton);
            this.MainPanel.Controls.Add(this.IDBox);
            this.MainPanel.Controls.Add(this.CopyrightPanel);
            this.MainPanel.Controls.Add(this.PWBox);
            this.MainPanel.Controls.Add(this.PWLabel);
            this.MainPanel.Controls.Add(this.IDLabel);
            this.MainPanel.Dock = System.Windows.Forms.DockStyle.Left;
            this.MainPanel.Location = new System.Drawing.Point(0, 30);
            this.MainPanel.Name = "MainPanel";
            this.MainPanel.Size = new System.Drawing.Size(200, 370);
            this.MainPanel.TabIndex = 1;
            // 
            // Statuslabel
            // 
            this.Statuslabel.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Statuslabel.ForeColor = System.Drawing.Color.White;
            this.Statuslabel.Location = new System.Drawing.Point(3, 51);
            this.Statuslabel.Name = "Statuslabel";
            this.Statuslabel.Size = new System.Drawing.Size(194, 23);
            this.Statuslabel.TabIndex = 8;
            this.Statuslabel.Text = "로그인";
            this.Statuslabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // infoLabel1
            // 
            this.infoLabel1.AutoSize = true;
            this.infoLabel1.ForeColor = System.Drawing.Color.White;
            this.infoLabel1.Location = new System.Drawing.Point(6, 25);
            this.infoLabel1.Name = "infoLabel1";
            this.infoLabel1.Size = new System.Drawing.Size(37, 12);
            this.infoLabel1.TabIndex = 7;
            this.infoLabel1.Text = "상태 :";
            // 
            // RegisterButton
            // 
            this.RegisterButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.RegisterButton.ForeColor = System.Drawing.Color.White;
            this.RegisterButton.Location = new System.Drawing.Point(107, 221);
            this.RegisterButton.Name = "RegisterButton";
            this.RegisterButton.Size = new System.Drawing.Size(75, 23);
            this.RegisterButton.TabIndex = 3;
            this.RegisterButton.Text = "회원가입";
            this.RegisterButton.UseVisualStyleBackColor = true;
            // 
            // LoginButton
            // 
            this.LoginButton.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.LoginButton.ForeColor = System.Drawing.Color.White;
            this.LoginButton.Location = new System.Drawing.Point(14, 221);
            this.LoginButton.Name = "LoginButton";
            this.LoginButton.Size = new System.Drawing.Size(75, 23);
            this.LoginButton.TabIndex = 2;
            this.LoginButton.Text = "로그인";
            this.LoginButton.UseVisualStyleBackColor = true;
            this.LoginButton.Click += new System.EventHandler(this.LoginButton_Click);
            // 
            // IDBox
            // 
            this.IDBox.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.IDBox.Location = new System.Drawing.Point(14, 113);
            this.IDBox.Name = "IDBox";
            this.IDBox.Size = new System.Drawing.Size(168, 14);
            this.IDBox.TabIndex = 0;
            this.IDBox.KeyDown += new System.Windows.Forms.KeyEventHandler(this.IDBox_KeyDown);
            // 
            // CopyrightPanel
            // 
            this.CopyrightPanel.Controls.Add(this.TitleLabel);
            this.CopyrightPanel.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.CopyrightPanel.Location = new System.Drawing.Point(0, 286);
            this.CopyrightPanel.Name = "CopyrightPanel";
            this.CopyrightPanel.Size = new System.Drawing.Size(200, 84);
            this.CopyrightPanel.TabIndex = 6;
            // 
            // TitleLabel
            // 
            this.TitleLabel.AutoSize = true;
            this.TitleLabel.ForeColor = System.Drawing.Color.White;
            this.TitleLabel.Location = new System.Drawing.Point(25, 37);
            this.TitleLabel.Name = "TitleLabel";
            this.TitleLabel.Size = new System.Drawing.Size(149, 12);
            this.TitleLabel.TabIndex = 0;
            this.TitleLabel.Text = "Development By Kim.C.G";
            // 
            // PWBox
            // 
            this.PWBox.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.PWBox.Location = new System.Drawing.Point(14, 176);
            this.PWBox.Name = "PWBox";
            this.PWBox.PasswordChar = '*';
            this.PWBox.Size = new System.Drawing.Size(168, 14);
            this.PWBox.TabIndex = 1;
            this.PWBox.KeyDown += new System.Windows.Forms.KeyEventHandler(this.PWBox_KeyDown);
            // 
            // PWLabel
            // 
            this.PWLabel.AutoSize = true;
            this.PWLabel.ForeColor = System.Drawing.Color.White;
            this.PWLabel.Location = new System.Drawing.Point(12, 150);
            this.PWLabel.Name = "PWLabel";
            this.PWLabel.Size = new System.Drawing.Size(31, 12);
            this.PWLabel.TabIndex = 1;
            this.PWLabel.Text = "PW :";
            // 
            // IDLabel
            // 
            this.IDLabel.AutoSize = true;
            this.IDLabel.ForeColor = System.Drawing.Color.White;
            this.IDLabel.Location = new System.Drawing.Point(19, 86);
            this.IDLabel.Name = "IDLabel";
            this.IDLabel.Size = new System.Drawing.Size(24, 12);
            this.IDLabel.TabIndex = 0;
            this.IDLabel.Text = "ID :";
            // 
            // ImagePanel
            // 
            this.ImagePanel.Controls.Add(this.Image);
            this.ImagePanel.Dock = System.Windows.Forms.DockStyle.Fill;
            this.ImagePanel.Location = new System.Drawing.Point(200, 30);
            this.ImagePanel.Name = "ImagePanel";
            this.ImagePanel.Size = new System.Drawing.Size(400, 370);
            this.ImagePanel.TabIndex = 2;
            // 
            // Image
            // 
            this.Image.Dock = System.Windows.Forms.DockStyle.Fill;
            this.Image.Image = ((System.Drawing.Image)(resources.GetObject("Image.Image")));
            this.Image.Location = new System.Drawing.Point(0, 0);
            this.Image.Name = "Image";
            this.Image.Size = new System.Drawing.Size(400, 370);
            this.Image.SizeMode = System.Windows.Forms.PictureBoxSizeMode.CenterImage;
            this.Image.TabIndex = 0;
            this.Image.TabStop = false;
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(600, 400);
            this.Controls.Add(this.ImagePanel);
            this.Controls.Add(this.MainPanel);
            this.Controls.Add(this.TitlePanel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Login";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Login";
            this.TitlePanel.ResumeLayout(false);
            this.TitlePanel.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.ExitButton)).EndInit();
            this.MainPanel.ResumeLayout(false);
            this.MainPanel.PerformLayout();
            this.CopyrightPanel.ResumeLayout(false);
            this.CopyrightPanel.PerformLayout();
            this.ImagePanel.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.Image)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel TitlePanel;
        private System.Windows.Forms.Panel MainPanel;
        private System.Windows.Forms.Panel ImagePanel;
        private System.Windows.Forms.PictureBox Image;
        private System.Windows.Forms.Label TitleLabel;
        private System.Windows.Forms.Button RegisterButton;
        private System.Windows.Forms.Button LoginButton;
        private System.Windows.Forms.TextBox IDBox;
        private System.Windows.Forms.Panel CopyrightPanel;
        private System.Windows.Forms.TextBox PWBox;
        private System.Windows.Forms.Label PWLabel;
        private System.Windows.Forms.Label IDLabel;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label Statuslabel;
        private System.Windows.Forms.Label infoLabel1;
        private System.Windows.Forms.PictureBox ExitButton;
    }
}

