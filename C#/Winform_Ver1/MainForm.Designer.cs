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
            this.MenuLine1 = new System.Windows.Forms.Panel();
            this.ProjectPanel = new System.Windows.Forms.Panel();
            this.Home_Button = new System.Windows.Forms.Button();
            this.MenuLine2 = new System.Windows.Forms.Panel();
            this.Kakao_Button = new System.Windows.Forms.Button();
            this.MenuLine3 = new System.Windows.Forms.Panel();
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
            // MenuLine2
            // 
            this.MenuLine2.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine2.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine2.Location = new System.Drawing.Point(0, 145);
            this.MenuLine2.Name = "MenuLine2";
            this.MenuLine2.Size = new System.Drawing.Size(216, 1);
            this.MenuLine2.TabIndex = 3;
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
            // MenuLine3
            // 
            this.MenuLine3.BackColor = System.Drawing.Color.LavenderBlush;
            this.MenuLine3.Dock = System.Windows.Forms.DockStyle.Top;
            this.MenuLine3.Location = new System.Drawing.Point(0, 187);
            this.MenuLine3.Name = "MenuLine3";
            this.MenuLine3.Size = new System.Drawing.Size(216, 1);
            this.MenuLine3.TabIndex = 5;
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1000, 600);
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
    }
}