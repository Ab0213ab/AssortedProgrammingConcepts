namespace PaycheckHelp
{
    partial class SettingsForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(SettingsForm));
            this.settingsInstructions = new System.Windows.Forms.Label();
            this.payRateSettingsTextBox = new System.Windows.Forms.TextBox();
            this.domesticPerDiemSettingsTextBox = new System.Windows.Forms.TextBox();
            this.internationalPerDiemSettingsTextBox = new System.Windows.Forms.TextBox();
            this.taxRateSettingsTextBox = new System.Windows.Forms.TextBox();
            this.btn_save = new System.Windows.Forms.Button();
            this.payRateLabel = new System.Windows.Forms.Label();
            this.domesticPDSettingsLabel = new System.Windows.Forms.Label();
            this.internationalPDSettingsLabel = new System.Windows.Forms.Label();
            this.taxRateSettingsLabel = new System.Windows.Forms.Label();
            this.btn_clear_settings = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // settingsInstructions
            // 
            this.settingsInstructions.AutoSize = true;
            this.settingsInstructions.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.settingsInstructions.Location = new System.Drawing.Point(335, 113);
            this.settingsInstructions.Margin = new System.Windows.Forms.Padding(5);
            this.settingsInstructions.Name = "settingsInstructions";
            this.settingsInstructions.Padding = new System.Windows.Forms.Padding(5);
            this.settingsInstructions.Size = new System.Drawing.Size(481, 50);
            this.settingsInstructions.TabIndex = 0;
            this.settingsInstructions.Text = "Change your settings below.";
            // 
            // payRateSettingsTextBox
            // 
            this.payRateSettingsTextBox.Location = new System.Drawing.Point(206, 211);
            this.payRateSettingsTextBox.Name = "payRateSettingsTextBox";
            this.payRateSettingsTextBox.Size = new System.Drawing.Size(743, 44);
            this.payRateSettingsTextBox.TabIndex = 1;
            // 
            // domesticPerDiemSettingsTextBox
            // 
            this.domesticPerDiemSettingsTextBox.Location = new System.Drawing.Point(206, 354);
            this.domesticPerDiemSettingsTextBox.Name = "domesticPerDiemSettingsTextBox";
            this.domesticPerDiemSettingsTextBox.Size = new System.Drawing.Size(743, 44);
            this.domesticPerDiemSettingsTextBox.TabIndex = 2;
            // 
            // internationalPerDiemSettingsTextBox
            // 
            this.internationalPerDiemSettingsTextBox.Location = new System.Drawing.Point(206, 503);
            this.internationalPerDiemSettingsTextBox.Name = "internationalPerDiemSettingsTextBox";
            this.internationalPerDiemSettingsTextBox.Size = new System.Drawing.Size(743, 44);
            this.internationalPerDiemSettingsTextBox.TabIndex = 3;
            // 
            // taxRateSettingsTextBox
            // 
            this.taxRateSettingsTextBox.Location = new System.Drawing.Point(206, 646);
            this.taxRateSettingsTextBox.Name = "taxRateSettingsTextBox";
            this.taxRateSettingsTextBox.Size = new System.Drawing.Size(743, 44);
            this.taxRateSettingsTextBox.TabIndex = 4;
            // 
            // btn_save
            // 
            this.btn_save.Location = new System.Drawing.Point(284, 829);
            this.btn_save.Margin = new System.Windows.Forms.Padding(3, 3, 3, 100);
            this.btn_save.Name = "btn_save";
            this.btn_save.Size = new System.Drawing.Size(204, 86);
            this.btn_save.TabIndex = 5;
            this.btn_save.Text = "Save";
            this.btn_save.UseVisualStyleBackColor = true;
            this.btn_save.Click += new System.EventHandler(this.btn_save_Click);
            // 
            // payRateLabel
            // 
            this.payRateLabel.AutoSize = true;
            this.payRateLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.payRateLabel.Location = new System.Drawing.Point(478, 277);
            this.payRateLabel.Name = "payRateLabel";
            this.payRateLabel.Size = new System.Drawing.Size(165, 40);
            this.payRateLabel.TabIndex = 6;
            this.payRateLabel.Text = "Pay Rate";
            this.payRateLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // domesticPDSettingsLabel
            // 
            this.domesticPDSettingsLabel.AutoSize = true;
            this.domesticPDSettingsLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.domesticPDSettingsLabel.Location = new System.Drawing.Point(351, 416);
            this.domesticPDSettingsLabel.Name = "domesticPDSettingsLabel";
            this.domesticPDSettingsLabel.Size = new System.Drawing.Size(413, 40);
            this.domesticPDSettingsLabel.TabIndex = 7;
            this.domesticPDSettingsLabel.Text = "Domestic Per Diem Rate";
            this.domesticPDSettingsLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // internationalPDSettingsLabel
            // 
            this.internationalPDSettingsLabel.AutoSize = true;
            this.internationalPDSettingsLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.internationalPDSettingsLabel.Location = new System.Drawing.Point(356, 574);
            this.internationalPDSettingsLabel.Name = "internationalPDSettingsLabel";
            this.internationalPDSettingsLabel.Size = new System.Drawing.Size(460, 40);
            this.internationalPDSettingsLabel.TabIndex = 8;
            this.internationalPDSettingsLabel.Text = "International Per Diem Rate";
            this.internationalPDSettingsLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // taxRateSettingsLabel
            // 
            this.taxRateSettingsLabel.AutoSize = true;
            this.taxRateSettingsLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.taxRateSettingsLabel.Location = new System.Drawing.Point(489, 729);
            this.taxRateSettingsLabel.Name = "taxRateSettingsLabel";
            this.taxRateSettingsLabel.Size = new System.Drawing.Size(163, 40);
            this.taxRateSettingsLabel.TabIndex = 9;
            this.taxRateSettingsLabel.Text = "Tax Rate";
            this.taxRateSettingsLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btn_clear_settings
            // 
            this.btn_clear_settings.Location = new System.Drawing.Point(667, 829);
            this.btn_clear_settings.Margin = new System.Windows.Forms.Padding(3, 3, 3, 100);
            this.btn_clear_settings.Name = "btn_clear_settings";
            this.btn_clear_settings.Size = new System.Drawing.Size(204, 86);
            this.btn_clear_settings.TabIndex = 10;
            this.btn_clear_settings.Text = "Clear";
            this.btn_clear_settings.UseVisualStyleBackColor = true;
            this.btn_clear_settings.Click += new System.EventHandler(this.btn_clear_settings_Click);
            // 
            // SettingsForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(288F, 288F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Dpi;
            this.AutoScroll = true;
            this.AutoSize = true;
            this.ClientSize = new System.Drawing.Size(1139, 997);
            this.Controls.Add(this.btn_clear_settings);
            this.Controls.Add(this.taxRateSettingsLabel);
            this.Controls.Add(this.internationalPDSettingsLabel);
            this.Controls.Add(this.domesticPDSettingsLabel);
            this.Controls.Add(this.payRateLabel);
            this.Controls.Add(this.btn_save);
            this.Controls.Add(this.taxRateSettingsTextBox);
            this.Controls.Add(this.internationalPerDiemSettingsTextBox);
            this.Controls.Add(this.domesticPerDiemSettingsTextBox);
            this.Controls.Add(this.payRateSettingsTextBox);
            this.Controls.Add(this.settingsInstructions);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MinimumSize = new System.Drawing.Size(45, 107);
            this.Name = "SettingsForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Settings";
            //this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.SettingsForm_FormClosing);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label settingsInstructions;
        private System.Windows.Forms.TextBox payRateSettingsTextBox;
        private System.Windows.Forms.TextBox domesticPerDiemSettingsTextBox;
        private System.Windows.Forms.TextBox internationalPerDiemSettingsTextBox;
        private System.Windows.Forms.TextBox taxRateSettingsTextBox;
        private System.Windows.Forms.Button btn_save;
        private System.Windows.Forms.Label payRateLabel;
        private System.Windows.Forms.Label domesticPDSettingsLabel;
        private System.Windows.Forms.Label internationalPDSettingsLabel;
        private System.Windows.Forms.Label taxRateSettingsLabel;
        private System.Windows.Forms.Button btn_clear_settings;
    }
}