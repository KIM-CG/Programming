namespace Winform_Ver1
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.TitlePanel = new System.Windows.Forms.Panel();
            this.ExitButton = new System.Windows.Forms.PictureBox();
            this.TitleLabel = new System.Windows.Forms.Label();
            this.MenuPanel = new System.Windows.Forms.Panel();
            this.MenuLine8 = new System.Windows.Forms.Panel();
            this.Setting_Button = new System.Windows.Forms.Button();
            this.MenuLine7 = new System.Windows.Forms.Panel();
            this.None3_Button = new System.Windows.Forms.Button();
            this.MenuLine6 = new System.Windows.Forms.Panel();
            this.None2_Button = new System.Windows.Forms.Button();
            this.MenuLine5 = new System.Windows.Forms.Panel();
            this.None1_Button = new System.Windows.Forms.Button();
            this.MenuLine4 = new System.Windows.Forms.Panel();
            this.None_Button = new System.Windows.Forms.Button();
            this.MenuLine3 = new System.Windows.Forms.Panel();
            this.Kakao_Button = new System.Windows.Forms.Button();
            this.MenuLine2 = new System.Windows.Forms.Panel();
            this.Home_Button = new System.Windows.Forms.Button();
            this.MenuLine1 = new System.Windows.Forms.Panel();
            this.ProjectPanel = new System.Windows.Forms.Panel();
            this.checkBox1 = new System.Windows.Forms.CheckBox();
            this.TitlePanel.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.ExitButton)).BeginInit();
            this.MenuPanel.SuspendLayout();
            this.SuspendLayout();
            // 
            // TitlePanel
            // 
            this.TitlePanel.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(53)))), ((int)(((byte)(57)))), ((int)(((byte)(68)))));
            this.TitlePanel.Controls.Add(this.ExitButton);
            this.TitlePanel.Controls.Add(this.TitleLabel);
            this.TitlePanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.TitlePanel.Location = new System.Drawing.Point(0, 0);
            this.TitlePanel.Name = "TitlePanel";
            this.TitlePanel.Size = new System.Drawing.Size(1000, 30);
            this.TitlePanel.TabIndex = 1;
            this.TitlePanel.MouseDown += new System.Windows.Forms.MouseEventHandler(this.TitlePanel_MouseDown);
            this.TitlePanel.MouseMove += new System.Windows.Forms.MouseEventHandler(this.TitlePanel_MouseMove);
            // 
            // ExitButton
            // 
            this.ExitButton.Image = ((System.Drawing.Image)(resources.GetObject("ExitButton.Image")));
            this.ExitButton.Location = new System.Drawing.Point(975, 4);
            this.ExitButton.Name = "ExitButton";
            this.ExitButton.Size = new System.Drawing.Size(20, 20);
            this.ExitButton.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.ExitButton.TabIndex = 1;
            this.ExitButton.TabStop = false;
            this.ExitButton.Click += new System.EventHandler(this.ExitButton_Click);
            // 
            // TitleLabel
            // 
            this.TitleLabel.AutoSize = true;
            this.TitleLabel.ForeColor = System.Drawing.Color.White;
            this.TitleLabel.Location = new System.Drawing.Point(9, 8);
            this.TitleLabel.Name = "TitleLabel";
            this.TitleLabel.Size = new System.Drawing.Size(65, 12);
            this.TitleLabel.TabIndex = 0;
            this.TitleLabel.Text = "포트폴리오";
            // 
            // MenuPanel
            // 
            this.MenuPanel.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(63)))), ((int)(((byte)(67)))), ((int)(((byte)(78)))));
            this.MenuPanel.Controls.Add(this.MenuLine8);
            this.MenuPanel.Controls.Add(this.Setting_Button);
            this.MenuPanel.Controls.Add(this.MenuLine7);
            this.MenuPanel.Controls.Add(this.None3_Button);
            this.MenuPanel.Controls.Add(this.MenuLine6);
            this.MenuPanel.Controls.Add(this.None2_Button);
            this.MenuPanel.Controls.Add(this.MenuLine5);
            this.MenuPanel.Controls.Add(this.None1_Button);
            this.MenuPanel.Controls.Add(this.MenuLine4);
            this.MenuPanel.Controls.Add(this.None_Button);
            this.MenuPanel.Controls.Add(this.MenuLine3);
            this.MenuPanel.Controls.Add(this.Kakao_Button);
            this.MenuPanel.Controls.Add(this.MenuLine2);
            this.MenuPanel.Controls.Add(this.Home_Button);
            this.MenuPanel.Controls.Add(this.MenuLine1);
            this.MenuPanel.Controls.Add(this.ProjectPanel);
            this.MenuPanel.Dock = System.Windows.Forms.DockStyle.Left;
            this.MenuPanel.Location = new System.Drawing.Point(0, 30);
            this.MenuPanel.Name = "MenuPanel";
            this.MenuPanel.Size = new System.Drawing.Size(216, 570);
            this.MenuPanel.TabIndex = 2;
            // 
            // MenuLine8
            // 
            this.MenuLine8.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine8.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine8.Location = new System.Drawing.Point(0, 397);
            this.MenuLine8.Name = "MenuLine8";
            this.MenuLine8.Size = new System.Drawing.Size(216, 1);
            this.MenuLine8.TabIndex = 3;
            // 
            // Setting_Button
            // 
            this.Setting_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.Setting_Button.FlatAppearance.BorderSize = 0;
            this.Setting_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Setting_Button.ForeColor = System.Drawing.Color.White;
            this.Setting_Button.Image = ((System.Drawing.Image)(resources.GetObject("Setting_Button.Image")));
            this.Setting_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Setting_Button.Location = new System.Drawing.Point(0, 356);
            this.Setting_Button.Name = "Setting_Button";
            this.Setting_Button.Size = new System.Drawing.Size(216, 41);
            this.Setting_Button.TabIndex = 10;
            this.Setting_Button.Text = "설정";
            this.Setting_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine7
            // 
            this.MenuLine7.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine7.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine7.Location = new System.Drawing.Point(0, 355);
            this.MenuLine7.Name = "MenuLine7";
            this.MenuLine7.Size = new System.Drawing.Size(216, 1);
            this.MenuLine7.TabIndex = 7;
            // 
            // None3_Button
            // 
            this.None3_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.None3_Button.FlatAppearance.BorderSize = 0;
            this.None3_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.None3_Button.ForeColor = System.Drawing.Color.White;
            this.None3_Button.Image = ((System.Drawing.Image)(resources.GetObject("None3_Button.Image")));
            this.None3_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.None3_Button.Location = new System.Drawing.Point(0, 314);
            this.None3_Button.Name = "None3_Button";
            this.None3_Button.Size = new System.Drawing.Size(216, 41);
            this.None3_Button.TabIndex = 9;
            this.None3_Button.Text = "None3_Button";
            this.None3_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine6
            // 
            this.MenuLine6.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine6.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine6.Location = new System.Drawing.Point(0, 313);
            this.MenuLine6.Name = "MenuLine6";
            this.MenuLine6.Size = new System.Drawing.Size(216, 1);
            this.MenuLine6.TabIndex = 7;
            // 
            // None2_Button
            // 
            this.None2_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.None2_Button.FlatAppearance.BorderSize = 0;
            this.None2_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.None2_Button.ForeColor = System.Drawing.Color.White;
            this.None2_Button.Image = ((System.Drawing.Image)(resources.GetObject("None2_Button.Image")));
            this.None2_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.None2_Button.Location = new System.Drawing.Point(0, 272);
            this.None2_Button.Name = "None2_Button";
            this.None2_Button.Size = new System.Drawing.Size(216, 41);
            this.None2_Button.TabIndex = 8;
            this.None2_Button.Text = "None2_Button";
            this.None2_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine5
            // 
            this.MenuLine5.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine5.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine5.Location = new System.Drawing.Point(0, 271);
            this.MenuLine5.Name = "MenuLine5";
            this.MenuLine5.Size = new System.Drawing.Size(216, 1);
            this.MenuLine5.TabIndex = 7;
            // 
            // None1_Button
            // 
            this.None1_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.None1_Button.FlatAppearance.BorderSize = 0;
            this.None1_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.None1_Button.ForeColor = System.Drawing.Color.White;
            this.None1_Button.Image = ((System.Drawing.Image)(resources.GetObject("None1_Button.Image")));
            this.None1_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.None1_Button.Location = new System.Drawing.Point(0, 230);
            this.None1_Button.Name = "None1_Button";
            this.None1_Button.Size = new System.Drawing.Size(216, 41);
            this.None1_Button.TabIndex = 7;
            this.None1_Button.Text = "None1_Button";
            this.None1_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine4
            // 
            this.MenuLine4.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine4.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine4.Location = new System.Drawing.Point(0, 229);
            this.MenuLine4.Name = "MenuLine4";
            this.MenuLine4.Size = new System.Drawing.Size(216, 1);
            this.MenuLine4.TabIndex = 6;
            // 
            // None_Button
            // 
            this.None_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.None_Button.FlatAppearance.BorderSize = 0;
            this.None_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.None_Button.ForeColor = System.Drawing.Color.White;
            this.None_Button.Image = ((System.Drawing.Image)(resources.GetObject("None_Button.Image")));
            this.None_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.None_Button.Location = new System.Drawing.Point(0, 188);
            this.None_Button.Name = "None_Button";
            this.None_Button.Size = new System.Drawing.Size(216, 41);
            this.None_Button.TabIndex = 6;
            this.None_Button.Text = "None_Button";
            this.None_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine3
            // 
            this.MenuLine3.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine3.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine3.Location = new System.Drawing.Point(0, 187);
            this.MenuLine3.Name = "MenuLine3";
            this.MenuLine3.Size = new System.Drawing.Size(216, 1);
            this.MenuLine3.TabIndex = 5;
            // 
            // Kakao_Button
            // 
            this.Kakao_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.Kakao_Button.FlatAppearance.BorderSize = 0;
            this.Kakao_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Kakao_Button.ForeColor = System.Drawing.Color.White;
            this.Kakao_Button.Image = ((System.Drawing.Image)(resources.GetObject("Kakao_Button.Image")));
            this.Kakao_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Kakao_Button.Location = new System.Drawing.Point(0, 146);
            this.Kakao_Button.Name = "Kakao_Button";
            this.Kakao_Button.Size = new System.Drawing.Size(216, 41);
            this.Kakao_Button.TabIndex = 4;
            this.Kakao_Button.Text = "카카오톡 자동응답";
            this.Kakao_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine2
            // 
            this.MenuLine2.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine2.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine2.Location = new System.Drawing.Point(0, 145);
            this.MenuLine2.Name = "MenuLine2";
            this.MenuLine2.Size = new System.Drawing.Size(216, 1);
            this.MenuLine2.TabIndex = 3;
            // 
            // Home_Button
            // 
            this.Home_Button.Dock = System.Windows.Forms.DockStyle.Top;
            this.Home_Button.FlatAppearance.BorderSize = 0;
            this.Home_Button.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.Home_Button.ForeColor = System.Drawing.Color.White;
            this.Home_Button.Image = ((System.Drawing.Image)(resources.GetObject("Home_Button.Image")));
            this.Home_Button.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.Home_Button.Location = new System.Drawing.Point(0, 104);
            this.Home_Button.Name = "Home_Button";
            this.Home_Button.Size = new System.Drawing.Size(216, 41);
            this.Home_Button.TabIndex = 0;
            this.Home_Button.Text = "메인메뉴";
            this.Home_Button.UseVisualStyleBackColor = true;
            // 
            // MenuLine1
            // 
            this.MenuLine1.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine1.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine1.Location = new System.Drawing.Point(0, 103);
            this.MenuLine1.Name = "MenuLine1";
            this.MenuLine1.Size = new System.Drawing.Size(216, 1);
            this.MenuLine1.TabIndex = 2;
            // 
            // ProjectPanel
            // 
            this.ProjectPanel.Dock = System.Windows.Forms.DockStyle.Top;
            this.ProjectPanel.Location = new System.Drawing.Point(0, 0);
            this.ProjectPanel.Name = "ProjectPanel";
            this.ProjectPanel.Size = new System.Drawing.Size(216, 103);
            this.ProjectPanel.TabIndex = 1;
            // 
            // checkBox1
            // 
            this.checkBox1.AutoSize = true;
            this.checkBox1.Location = new System.Drawing.Point(756, 64);
            this.checkBox1.Name = "checkBox1";
            this.checkBox1.Size = new System.Drawing.Size(195, 16);
            this.checkBox1.TabIndex = 3;
            this.checkBox1.Text = "Windows 시작시 프로그램 실행";
            this.checkBox1.UseVisualStyleBackColor = true;
            this.checkBox1.CheckedChanged += new System.EventHandler(this.checkBox1_CheckedChanged);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1000, 600);
            this.Controls.Add(this.checkBox1);
            this.Controls.Add(this.MenuPanel);
            this.Controls.Add(this.TitlePanel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "MainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "MainForm";
            this.TitlePanel.ResumeLayout(false);
            this.TitlePanel.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.ExitButton)).EndInit();
            this.MenuPanel.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel TitlePanel;
        private System.Windows.Forms.PictureBox ExitButton;
        private System.Windows.Forms.Label TitleLabel;
        private System.Windows.Forms.Panel MenuPanel;
        private System.Windows.Forms.Panel MenuLine1;
        private System.Windows.Forms.Panel ProjectPanel;
        private System.Windows.Forms.Button Home_Button;
        private System.Windows.Forms.Panel MenuLine2;
        private System.Windows.Forms.Button Kakao_Button;
        private System.Windows.Forms.Panel MenuLine3;
        private System.Windows.Forms.Button None1_Button;
        private System.Windows.Forms.Panel MenuLine4;
        private System.Windows.Forms.Button None_Button;
        private System.Windows.Forms.Button Setting_Button;
        private System.Windows.Forms.Button None3_Button;
        private System.Windows.Forms.Button None2_Button;
        private System.Windows.Forms.Panel MenuLine5;
        private System.Windows.Forms.Panel MenuLine6;
        private System.Windows.Forms.Panel MenuLine7;
        private System.Windows.Forms.Panel MenuLine8;
        private System.Windows.Forms.CheckBox checkBox1;
    }
}